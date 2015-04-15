/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.time;

import org.joda.time.DateTime;

/**
 * 1000ms in 1s 60s in 1min 60min in 1h 24h in 1 day 7 days in 1 week
 *
 * @author Godzio
 */
public class FakeTimeSource implements DateTimeSource {

    private static final long ONE_WEEK = 1000 * 60 * 60 * 24 * 7;

    @Override
    public DateTime getDateTime() {
        return new DateTime().plus( ONE_WEEK );
    }

}
