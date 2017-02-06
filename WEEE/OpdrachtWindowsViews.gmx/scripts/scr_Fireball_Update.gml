// Controleert wanneer de vuurbal buiten het scherm verdwijnt:
if (x < -50 || x > room_width + 50 || y < -50 || y > room_height + 50)
{
    if (player.currentLives > 0)
    {
        player.currentPoints++;
    }
    
    instance_destroy();
}
