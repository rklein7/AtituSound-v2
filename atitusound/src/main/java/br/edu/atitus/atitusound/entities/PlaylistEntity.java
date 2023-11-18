package br.edu.atitus.atitusound.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_playlist")
public class PlaylistEntity extends GenericEntity{

	private boolean public_share;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_playlist_music")
	private List<MusicEntity> musics;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="user_uuid")
	private UserEntity user;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public boolean getPublic_share() {

		return public_share;
	}

	public void setPublic_share(boolean public_share) {

		this.public_share = public_share;
	}

	public List<MusicEntity> getMusics() {

		return musics;
	}

	public void setMusics(List<MusicEntity> musics) {

		this.musics = musics;
	}



}
