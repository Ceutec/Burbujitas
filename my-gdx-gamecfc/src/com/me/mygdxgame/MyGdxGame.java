package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MyGdxGame implements ApplicationListener {
	private Texture texture;
	Stage stage;
	static Image image;
	ArrayList<Image> burbujitas;
	int frame = 0;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		texture = new Texture(Gdx.files.internal("data/pelotita.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 64, 64);
		
		stage = new Stage();
		image = new Image(region);
		stage.addActor(image);
		
		image.addListener(new MiListener());
		
		Gdx.input.setInputProcessor(stage);
		
		burbujitas = new ArrayList<Image>();
	}


	@Override
	public void dispose() {
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		if(frame%50 == 0)
		{
//			Image image = new Image(texture);
//			image.setY((float)Math.random()*300);
//			burbujitas.add(image);
			stage.addActor(new Burbuja());
		}
		
		for(int i=0;i<burbujitas.size();i++)
		{
			Image temporal = burbujitas.get(i);
			temporal.setX(temporal.getX()+1);
		}
		
		image.setX(image.getX()+5);
		
		stage.draw();
		stage.act();
		
		frame++;
		
		System.out.println(frame);
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
