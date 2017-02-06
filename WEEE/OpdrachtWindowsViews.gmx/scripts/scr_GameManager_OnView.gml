// OPDRACHT A + B:

view_enabled = true;

view_visible[0] = true;
view_xview[0] = 0;
view_yview[0] = 0;

view_wview[0] = 760;
view_hview[0] = 500;

view_visible[1] = true;
view_xport[1] = 0;
view_yport[1] = 0;

view_wport[1] = 200;
view_hport[1] = 200;

view_wview[1] = 200 * 0.5;
view_hview[1] = 200 * 0.5;

view_object[1] = instance_find(obj_Player, 0);

view_visible[2] = false;
view_xport[2] = room_width - 200;
view_yport[2] = 0;

view_wport[2] = 200;
view_hport[2] = 200;

view_wview[2] = 200 * 0.3;
view_hview[2] = 200 * 0.3;

view_object[2] = instance_find(obj_GameManager, 0);
