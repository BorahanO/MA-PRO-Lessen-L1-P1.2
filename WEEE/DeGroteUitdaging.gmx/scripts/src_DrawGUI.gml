//draw_set_font(font_Centaur);
draw_set_color(c_white);

draw_text_transformed(room_width - 130, 10, "Health: " + string(obj_Player.currentHealth), 1, 1, 0);
draw_text_transformed(room_width - 130, 50, "Points: " + string(global.points), 1, 1, 0);
