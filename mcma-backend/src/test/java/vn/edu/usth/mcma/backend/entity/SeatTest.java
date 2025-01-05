package vn.edu.usth.mcma.backend.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vn.edu.usth.mcma.backend.dto.SeatHelperInput;
import vn.edu.usth.mcma.backend.helper.SeatHelper;

import java.util.ArrayList;
import java.util.List;

public class SeatTest {
    private List<SeatHelperInput> seatHelperInputs;
    @BeforeEach
    void init() {
        seatHelperInputs = new ArrayList<>();
        seatHelperInputs.add(SeatHelperInput.builder().row(1).col(1).typeId(-1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(1).col(2).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(1).col(3).typeId(-1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(1).col(4).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(2).col(1).typeId(1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(2).col(2).typeId(2).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(2).col(3).typeId(1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(2).col(4).typeId(-1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(3).col(1).typeId(3).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(3).col(2).typeId(3).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(3).col(3).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(3).col(4).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(4).col(1).typeId(1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(4).col(2).typeId(1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(4).col(3).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(4).col(4).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(5).col(1).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(5).col(2).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(5).col(3).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(5).col(4).typeId(4).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(6).col(1).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(6).col(2).typeId(0).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(6).col(3).typeId(-1).build());
        seatHelperInputs.add(SeatHelperInput.builder().row(6).col(4).typeId(-1).build());
    }

    @Test
    void test1() {
        SeatHelper seatHelper = new SeatHelper(seatHelperInputs);
        System.out.println(seatHelper.getSeatHelperOutputs());
    }

}
