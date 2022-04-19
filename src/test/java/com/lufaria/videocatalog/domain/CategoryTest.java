package com.lufaria.videocatalog.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CategoryTest {

    @Test
    @DisplayName("Should update category successfully")
    public void updateCategory() {
        final Category entity = new Category("Comedy", "Comedy series and movies");
        assertNotNull(entity);
        entity.update("Horror", "Horror series and movies", false);
        assertNotNull(entity);
        assertEquals("Horror", entity.getName());
        assertEquals("Horror series and movies", entity.getDescription());
        assertEquals(false, entity.getActive());
    }
}