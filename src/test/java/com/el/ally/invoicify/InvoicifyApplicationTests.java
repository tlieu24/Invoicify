package com.el.ally.invoicify;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.el.ally.invoicify.controllers.InvoiceController;
import com.el.ally.invoicify.models.Invoice;
import com.el.ally.invoicify.repositories.InvoiceRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoicifyApplicationTests {

	@Test
	public void contextLoads() {
	}
	private InvoiceController controller;

    @Mock
    private InvoiceRepository invoiceRepo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new InvoiceController(invoiceRepo);
    }

    @Test
    public void getAll_invoice() {
        // Arrange
        ArrayList<Invoice> invoice = new ArrayList<Invoice>();
        when(invoiceRepo.findAll()).thenReturn(invoice);

        // Act
        List<Invoice> actual = controller.getAll();

        // Assert
        assertThat(actual).hasSize(invoice.size());
        verify(invoiceRepo).findAll();
    }


}
