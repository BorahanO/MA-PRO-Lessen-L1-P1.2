// OPDRACHT B:

if(self.playerHit) {
    draw_sprite_ext(spr_Player, directionFrame + currentFrame, x, y, image_xscale, image_yscale, 0, c_red, 1);
} else {
    draw_sprite_ext(spr_Player, directionFrame + currentFrame, x, y, image_xscale, image_yscale, 0, c_white, 1);
}

