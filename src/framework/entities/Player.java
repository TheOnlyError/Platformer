package framework.entities;

import framework.graphics.Sprite;

public class Player {

	public final Sprite sprite;

	public Player() {
		sprite = Sprite.get("../res/player.png");
	}

}
