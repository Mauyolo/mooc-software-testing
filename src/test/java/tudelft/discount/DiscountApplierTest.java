package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    private ProductDao productDaoMock;
    private DiscountApplier discountApplier;
    
    @BeforeEach
    public void setUp() {
        // Crear el mock de ProductDao
        productDaoMock = mock(ProductDao.class);
        // Crear la instancia de DiscountApplier inyectando el mock
        discountApplier = new DiscountApplier(productDaoMock);
    }
    @Test
    public void testApplyDiscountForHomeCategory() {
        // Crear una lista de productos con categoría "HOME"
        List<Product> products = Arrays.asList(new Product("Product 1", 100.0, "HOME"));
        // Configurar el comportamiento del mock para devolver los productos
        when(productDaoMock.all()).thenReturn(products);
        // Aplicar descuentos
        discountApplier.setNewPrices();
        // Verificar que el precio se haya actualizado correctamente (100 * 0.9 = 90)
        assertEquals(90.0, products.get(0).getPrice(), 0.001);
    }

    @Test
    public void testApplyDiscountForBusinessCategory() {
        // Crear una lista de productos con categoría "BUSINESS"
        List<Product> products = Arrays.asList(new Product("Product 2", 100.0, "BUSINESS"));
        // Configurar el comportamiento del mock para devolver los productos
        when(productDaoMock.all()).thenReturn(products);
        // Aplicar descuentos
        discountApplier.setNewPrices();
        // Verificar que el precio se haya actualizado correctamente (100 * 1.1 = 110)
        assertEquals(110.0, products.get(0).getPrice(), 0.001);
    }

    @Test
    public void testNoDiscountForOtherCategories() {
        // Crear una lista de productos con una categoría no afectada
        List<Product> products = Arrays.asList(new Product("Product 3", 100.0, "OTHER"));
        // Configurar el comportamiento del mock para devolver los productos
        when(productDaoMock.all()).thenReturn(products);
        // Aplicar descuentos
        discountApplier.setNewPrices();
        // Verificar que el precio no cambió (debe seguir siendo 100)
        assertEquals(100.0, products.get(0).getPrice(), 0.001);
    }

    @Test
    public void testEmptyProductList() {
        // Crear una lista vacía de productos
        List<Product> products = Arrays.asList();
        // Configurar el comportamiento del mock para devolver una lista vacía
        when(productDaoMock.all()).thenReturn(products);
        // Aplicar descuentos
        discountApplier.setNewPrices();
        // Verificar que la lista sigue vacía (ningún producto)
        assertTrue(products.isEmpty());
    }
}
