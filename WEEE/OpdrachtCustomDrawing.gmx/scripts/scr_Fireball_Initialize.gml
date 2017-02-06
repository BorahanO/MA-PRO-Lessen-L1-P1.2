player = instance_find(obj_Player, 0);

move_towards_point(player.x, player.y, irandom_range(5, 15));


rotation = direction - 90;
