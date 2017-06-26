package lab.aikibo.controller;

import lab.aikibo.component.SearchComponent;
import lab.aikibo.entity.Flight;
import lab.aikibo.etc.SearchQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by tamami on 26/06/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/search")
public class SearchRestController {

    private SearchComponent searchComponent;

    @Autowired
    public SearchRestController(SearchComponent searchComponent) {
        this.searchComponent = searchComponent;
    }

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public List<Flight> search(@RequestBody SearchQuery query) {
        System.out.println("Input : " + query);
        return searchComponent.search(query);
    }

}
