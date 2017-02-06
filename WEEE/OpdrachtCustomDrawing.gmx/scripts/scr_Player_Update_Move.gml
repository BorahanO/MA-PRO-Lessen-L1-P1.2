/// scr_Player_Update_Move(key)

switch(argument[0])
{
    case ord('W'):
        y -= moveSpeed;
        break;
        
    case ord('S'):
        y += moveSpeed;
        break;
        
    case ord('A'):
        x -= moveSpeed;
        break;
        
    case ord('D'):
        x += moveSpeed;
        break;
}

if (x - (sprite_width * 0.5) < 0)
{ x = 0 + (sprite_width * 0.5); }
else if (x + (sprite_width * 0.5) > room_width)
{ x = room_width - (sprite_width * 0.5); }
if (y - (sprite_height * 0.5) < 0)
{ y = 0 + (sprite_height * 0.5); }
else if (y + (sprite_height * 0.5) > room_height)
{ y = room_height - (sprite_height * 0.5); }
