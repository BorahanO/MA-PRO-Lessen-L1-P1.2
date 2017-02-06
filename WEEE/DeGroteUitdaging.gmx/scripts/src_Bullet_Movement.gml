if(is_undefined(moveDirection)) {
    return false;
}

    if moveDirection == 0 {
        self.y -= moveSpeed;
    }
    
    if moveDirection == 180 {
        self.y += moveSpeed;
    }
    
    if moveDirection == 90 {
        self.x -= moveSpeed;
    }
    
    if moveDirection == 270 {
        self.x += moveSpeed;
    }

