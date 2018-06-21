package com.el.ally.invoicify;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.controllers.BillingRecordController;
import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

public class BillingRecordControllerTest {

	private BillingRecordController controller;

    @Mock
    private BillingRecordRepository billingrecordRepo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new BillingRecordController(billingrecordRepo);
    }

    @Test
    public void getAll_billingrecords() {
        // Arrange
        ArrayList<BillingRecord> billingrecords = new ArrayList<BillingRecord>();
        when(billingrecordRepo.findAll()).thenReturn(billingrecords);

        // Act
        List<BillingRecord> actual = controller.getAll();

        // Assert
        assertThat(actual).hasSize(billingrecords.size());
        verify(billingrecordRepo).findAll();
    }
}
