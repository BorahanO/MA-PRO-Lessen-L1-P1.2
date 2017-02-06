y += moveSpeed;

if (y + (sprite_height * scale) > room_height * scale)
{
    instance_destroy();
}
