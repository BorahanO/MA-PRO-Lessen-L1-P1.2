/// scr_Player_Update_Move(key)

switch(argument[0])
{
    case ord('W'):
        y -= ((moveSpeed * 0.25) * scale);
        break;
        
    case ord('S'):
        y += ((moveSpeed * 0.25) * scale);
        break;
        
    case ord('A'):
        x -= (moveSpeed * scale);
        break;
        
    case ord('D'):
        x += (moveSpeed * scale);
        break;
}

if (x - (sprite_width * 0.5) < 0)
{ x = 0 + (sprite_width * 0.5); }
else if (x + (sprite_width * 0.5) > room_width)
{ x = room_width - (sprite_width * 0.5); }
if (y - (sprite_height * 0.5) < borderTop)
{ y = borderTop + (sprite_height * 0.5); }
else if (y + (sprite_height * 0.5) > room_height)
{ y = room_height - (sprite_height * 0.5); }



scale = y / (room_height * 0.75);


depth = -(y + ((sprite_height * scale) * 0.5));
