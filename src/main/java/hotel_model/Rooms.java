package hotel_model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pic;
    private String type;
    private String price;
    private String space;
    private boolean shower;
    private boolean phone;
    private boolean wifi;
    private boolean tv;
    private boolean glass;
    private boolean cutlery;
}
