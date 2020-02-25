package com.company;

import java.util.Date;

class CurrentTime extends Time {

    CurrentTime() {
        Date current = new Date();
        this.setDate(current.getTime());
        this.setMinutes(current.getMinutes());
        this.setSeconds(current.getSeconds());
        this.setHour(current.getHours());
    }
}

