/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 *
 * @author Godzio
 */
@RunWith( PowerMockRunner.class )
@PrepareForTest( { DateTimeSourceFabric.class } )
public class OrderTest {

    @Test( expected = OrderExpiredException.class )
    public void confirm_fakeTimeUsage_expectedOrderExpiredException() {
        //prepare object of FakeTimeSource
        DateTimeSource source = new FakeTimeSource();
        //prepare DateTimeSourceFabric
        mockStatic( DateTimeSourceFabric.class );
        when( DateTimeSourceFabric.getTimeSource( (String) Mockito.any() ) ).thenReturn( source );
        
        
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}
