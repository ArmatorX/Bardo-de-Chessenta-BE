package com.ArmatorX.BardodeChessentaBE.audioHandler;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.event.AudioEvent;
import com.sedmelluq.discord.lavaplayer.player.event.AudioEventListener;
import com.sedmelluq.discord.lavaplayer.player.event.TrackEndEvent;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason;

public class TrackScheduler implements AudioEventListener {
	private AudioPlayer audioPlayer;
	
	public TrackScheduler(AudioPlayer audioPlayer) {
		this.audioPlayer = audioPlayer;
	}
	
	@Override
	public void onEvent(AudioEvent event) {
		// TODO Auto-generated method stub
		if (event instanceof TrackEndEvent) {
			if (((TrackEndEvent) event).endReason == AudioTrackEndReason.FINISHED) {
				this.audioPlayer.playTrack(((TrackEndEvent) event).track.makeClone());
			}
		}
	}
}
