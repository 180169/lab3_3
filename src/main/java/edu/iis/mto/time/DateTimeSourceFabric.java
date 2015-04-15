/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

/**
 *
 * @author Godzio
 */
public class DateTimeSourceFabric {

    public static DateTimeSource getTimeSource( String source ) {
        DateTimeSource dateTimeSource = null;
        switch ( source ) {
            case "RT":
                dateTimeSource = new RealTimeSource();
                break;
            case "FT":
                dateTimeSource = new FakeTimeSource();
                break;

            default:
                throw new IllegalArgumentException( "unknown DateTimeSource type: "
                        + source );
        }
        return dateTimeSource;
    }
}
