package SoftwareBuilder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareBuilderTest {

    @Test
     void deveRetornarExcecaoParaSoftwareSemRef() {
        try {
            SoftwareBuilder softwareBuilder = new SoftwareBuilder();
            Software software = softwareBuilder
                    .setNome("VS Code")
                    .setFabricante("Microsoft")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Referência inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSoftwareSemNome() {
        try {
            SoftwareBuilder softwareBuilder = new SoftwareBuilder();
            Software software = softwareBuilder
                    .setRef(1)
                    .setFabricante("Microsoft")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSoftwareValido() {
        SoftwareBuilder softwareBuilder = new SoftwareBuilder();
        Software software = softwareBuilder
                .setRef(1)
                .setNome("VS Code")
                .setFabricante("Microsoft")
                .build();

        assertNotNull(software);
    }

}