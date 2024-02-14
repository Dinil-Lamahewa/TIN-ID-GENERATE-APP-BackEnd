package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CitizenDTO {
    private String TIN;
    private String NameWithInitial;
    private String FullName;
    private String NIC;
    private String Dob;
    private String Cob;
    private String Gender;
    private String Soi;
    private String PermanentAddress;
    private String ContactNumber;
    private String CivilStatus;
    private String Profession;
}
