package hotel_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import hotel_model.Rooms;

import hotel_repositories.HotelRepository;

@RestController
@RequestMapping("/single-rooms")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/get-all")
    public List<Rooms> getAllsingls(){
        return this.hotelRepository.findAll();
    }

    @PostMapping("/add-room")
    public ResponseEntity<?> addRoom(@RequestBody Rooms room){
        return new ResponseEntity<>(this.hotelRepository.save(room), HttpStatus.CREATED);
    }
}
