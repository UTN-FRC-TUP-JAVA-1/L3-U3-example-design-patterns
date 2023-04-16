package ar.edu.utn.frc.tup.lciii;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Song {

    private String title;
    private String album;
    private String artist;
    private BigDecimal duration;
}
