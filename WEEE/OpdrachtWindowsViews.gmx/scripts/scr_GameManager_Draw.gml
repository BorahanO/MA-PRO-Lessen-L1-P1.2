draw_set_blend_mode(bm_subtract);

for (var i = 0; i < instance_number(obj_Enemy); i++)
{
    var enemy = instance_find(obj_Enemy, i);
    draw_ellipse_colour(enemy.x - ((enemy.sprite_width * 0.5) * enemy.scale), enemy.place - ((10 * enemy.scale) * 0.5), (enemy.x - ((enemy.sprite_width * 0.5) * enemy.scale)) + (enemy.sprite_width * enemy.scale), enemy.place - ((10 * enemy.scale) * 0.5) + (10 * enemy.scale), c_white, c_black, 0);
    //draw_circle_colour(x, enemy.place, 15, c_black, c_black, 0);
}

draw_set_blend_mode(bm_normal);
