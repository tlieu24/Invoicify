package com.el.ally.invoicify;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.el.ally.invoicify.controllers.FlatFeeBillingRecordController;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

public class FlatFeeBillingRecordControllerTest {
	
	private FlatFeeBillingRecordController fbrController;
	
	@Mock
    private BillingRecordRepository billingRecordRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        fbrController = new FlatFeeBillingRecordController(billingRecordRepository);
    }
    
	@Test
    public void create_actor_and_return_it() {
        // Arrange
		FlatFeeBillingRecord ffbRecord = new FlatFeeBillingRecord();
        when(billingRecordRepository.save(ffbRecord)).thenReturn(ffbRecord);

        // Act
        FlatFeeBillingRecord actual = fbrController.create(ffbRecord);

        // Assert
        assertThat(actual).isSameAs(ffbRecord);
        verify(billingRecordRepository).save(ffbRecord);
    }
}

