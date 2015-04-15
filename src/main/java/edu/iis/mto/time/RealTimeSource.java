/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

import org.joda.time.DateTime;

/**
 *
 * @author Godzio
 */
public class RealTimeSource implements DateTimeSource {

    @Override
    public DateTime getDateTime() {
        return new DateTime();
    }

}
