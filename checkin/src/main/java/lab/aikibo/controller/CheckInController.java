package lab.aikibo.controller;

import lab.aikibo.component.CheckinComponent;
import lab.aikibo.entity.CheckInRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tamami on 26/06/17.
 */
@RestController
@CrossOrigin
@RequestMapping("/checkin")
public class CheckInController {

    private CheckinComponent checkInComponent;

    @Autowired
    public CheckInController(CheckinComponent checkInComponent) {
        this.checkInComponent = checkInComponent;
    }

    @RequestMapping("/get/{id}")
    public CheckInRecord getCheckIn(@PathVariable long id) {
        return checkInComponent.getCheckInRecord(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public long checkIn(@RequestBody CheckInRecord checkIn) {
        return checkInComponent.checkIn(checkIn);
    }

}
