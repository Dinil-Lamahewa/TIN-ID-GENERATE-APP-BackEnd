package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Citizen {
    @Id
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
