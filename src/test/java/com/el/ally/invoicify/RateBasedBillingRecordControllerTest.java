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

import com.el.ally.invoicify.controllers.RateBasedBillingRecordController;
import com.el.ally.invoicify.models.RateBasedBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;
import com.el.ally.invoicify.repositories.InvoiceLineItemRepository;

public class RateBasedBillingRecordControllerTest {

    private RateBasedBillingRecordControllerTest controller;

    @Mock
    private BillingRecordRepository billingRecordRepo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        controller = new RateBasedBillingRecordController(billingRecordRepo);
    }

    @Test
    public void create_rbbrecord_and_return_it() {
        // Arrange
    	RateBasedBillingRecord record = new RateBasedBillingRecord();
        when(billingRecordRepo.save(record)).thenReturn(record);

        // Act
        RateBasedBillingRecord actual = controller.create(record);

        // Assert
        assertThat(actual).isSameAs(record);
        verify(billingRecordRepo).save(record);
    }

}