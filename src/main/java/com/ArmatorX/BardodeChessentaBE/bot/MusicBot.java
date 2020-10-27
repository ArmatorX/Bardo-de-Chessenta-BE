package com.ArmatorX.BardodeChessentaBE.bot;

import javax.security.auth.login.LoginException;

import com.ArmatorX.BardodeChessentaBE.audioHandler.AudioPlayerSendHandler;
import com.ArmatorX.BardodeChessentaBE.audioHandler.TrackScheduler;
import com.sedmelluq.discord.lavaplayer.player.AudioLoadResultHandler;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.exceptions.RateLimitedException;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 * Esta clase se encarga de gestionar la comunicación entre 
 * la API y el bot de Discord.
 * Utiliza las librerías JDA y Lava Player.
 * @author ArmatorX
 *
 */
public class MusicBot extends ListenerAdapter 
{
	private String canalVoz;
	private String urlCancion;
	private AudioPlayer audioPlayer;
	private AudioPlayerManager audioManager;
	private TrackScheduler trackScheduler;
	private Guild guild;
	private VoiceChannel channel;
	private JDA jda;
	
    public MusicBot(String token)    
    {
    	try {
	        this.jda = JDABuilder.createDefault(token) 
	            .addEventListeners(this) 
	            .build();
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
        this.audioManager = new DefaultAudioPlayerManager();
        AudioSourceManagers.registerRemoteSources(this.audioManager);
        
        this.audioPlayer = audioManager.createPlayer();
        
        TrackScheduler trackScheduler = new TrackScheduler(this.audioPlayer);
        this.audioPlayer.addListener(trackScheduler);
    }
    
    public void setUrlCancion(String urlCancion) {
    	this.urlCancion = urlCancion;
    }
    
    public Guild getGuild() {
    	return this.guild;
    }
    
    public void reproducir() {   	
    	this.audioManager.loadItem(this.urlCancion, new AudioLoadResultHandler() {
			
			@Override
			public void trackLoaded(AudioTrack track) {
				System.out.println("[Bardo de Chessenta] INFO Cargando canción.");
				
		    	audioPlayer.playTrack(track);
		    	
				System.out.println("[Bardo de Chessenta] INFO Se cargó la canción correctamente.");
			}
			
			@Override
			public void playlistLoaded(AudioPlaylist playlist) {
				System.out.println("[Bardo de Chessenta] WARN Se cargó una lista de reproducción."
						+ " Esta funcionalidad no está soportada.");
				System.out.println("[Bardo de Chessenta] INFO Cargando primera canción.");
				
				audioPlayer.playTrack(playlist.getTracks().get(0));
				
				System.out.println("[Bardo de Chessenta] INFO Se cargó la primera canción de la lista"
						+ " correctamente.");
			}
			
			@Override
			public void noMatches() {
				System.out.println("[Bardo de Chessenta] ERROR No se encontró ninguna canción.");
				
			}
			
			@Override
			public void loadFailed(FriendlyException exception) {
				System.out.println("[Bardo de Chessenta] ERROR Error en la carga de la canción.");
			}
		});
    }
    
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) 
    {
    	System.out.println("[Bardo de Chessenta] INFO Se recibió un mensaje.");
    	
    	String mensaje = event.getMessage().getContentRaw();
    	
    	if (mensaje.equals("!connect")) {

    		System.out.println("[Bardo de Chessenta] INFO Iniciando conexión con el servidor.");
    		
        	this.guild = event.getGuild();
        	this.channel = event.getMember().getVoiceState().getChannel();
        	
        	System.out.println("[Bardo de Chessenta] INFO Obteniendo administrador de sonido del servidor.");
        	
    		AudioManager manager = this.guild.getAudioManager();
    		
    		System.out.println("[Bardo de Chessenta] INFO Inicializando reproductor.");
    		
    		manager.setSendingHandler(new AudioPlayerSendHandler(this.audioPlayer));
    		
        	System.out.println("[Bardo de Chessenta] INFO Conectando bot al servidor '" + event.getGuild().getName() 
        			+ "', al canal '" + event.getMember().getVoiceState().getChannel().getName() + "'.");
    		
    		manager.openAudioConnection(this.channel);
    		
    		System.out.println("[Bardo de Chessenta] INFO Bot conectado.");
    	}
    }
}