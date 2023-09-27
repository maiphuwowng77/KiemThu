import org.junit.Test;
import static org.junit.Assert.*;

public class studentTitleTest {
    @Test
    public void testacademicPerformance1() {
        String output = studentTitle.academicPerformance(-1.50);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void testacademicPerformance2() {
        String output = studentTitle.academicPerformance(0.5);
        assertEquals("Kém", output);
    }

    @Test
    public void testacademicPerformance3() {
        String output = studentTitle.academicPerformance(1.32);
        assertEquals("Yếu", output);
    }

    @Test
    public void testacademicPerformance4() {
        String output = studentTitle.academicPerformance(2.43);
        assertEquals("Trung bình", output);
    }

    @Test
    public void testacademicPerformance5() {
        String output = studentTitle.academicPerformance(2.92);
        assertEquals("Khá", output);
    }

    @Test
    public void testacademicPerformance6() {
        String output = studentTitle.academicPerformance(3.33);
        assertEquals("Giỏi", output);
    }

    @Test
    public void testacademicPerformance7() {
        String output = studentTitle.academicPerformance(3.77);
        assertEquals("Xuất sắc", output);
    }

    @Test
    public void testacademicPerformance8() {
        String output = studentTitle.academicPerformance(5.11);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle1() {
        String output = studentTitle.studentTitle(-1.50, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle2() {
        String output = studentTitle.studentTitle(-1.50, 32);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle3() {
        String output = studentTitle.studentTitle(-1.50, 75);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle4() {
        String output = studentTitle.studentTitle(-1.50, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle5() {
        String output = studentTitle.studentTitle(0.5, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle6() {
        String output = studentTitle.studentTitle(0.5, 32);
        assertEquals("Sinh viên Kém", output);
    }

    @Test
    public void teststudentTitle7() {
        String output = studentTitle.studentTitle(0.5, 65);
        assertEquals("Sinh viên Kém", output);
    }

    @Test
    public void teststudentTitle8() {
        String output = studentTitle.studentTitle(0.5, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle9() {
        String output = studentTitle.studentTitle(1.32, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle10() {
        String output = studentTitle.studentTitle(1.32, 32);
        assertEquals("Sinh viên Yếu", output);
    }

    @Test
    public void teststudentTitle11() {
        String output = studentTitle.studentTitle(1.32, 65);
        assertEquals("Sinh viên Yếu", output);
    }

    @Test
    public void teststudentTitle12() {
        String output = studentTitle.studentTitle(1.32, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle13() {
        String output = studentTitle.studentTitle(2.43, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle14() {
        String output = studentTitle.studentTitle(2.43, 32);
        assertEquals("Sinh viên Trung bình", output);
    }

    @Test
    public void teststudentTitle15() {
        String output = studentTitle.studentTitle(2.43, 65);
        assertEquals("Sinh viên Trung bình", output);
    }

    @Test
    public void teststudentTitle16() {
        String output = studentTitle.studentTitle(2.43, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle17() {
        String output = studentTitle.studentTitle(2.92, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle18() {
        String output = studentTitle.studentTitle(2.92, 32);
        assertEquals("Sinh viên Khá", output);
    }

    @Test
    public void teststudentTitle19() {
        String output = studentTitle.studentTitle(2.92, 65);
        assertEquals("Sinh viên Khá", output);
    }

    @Test
    public void teststudentTitle20() {
        String output = studentTitle.studentTitle(2.92, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle21() {
        String output = studentTitle.studentTitle(3.33, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitl22() {
        String output = studentTitle.studentTitle(3.33, 32);
        assertEquals("Sinh viên Khá", output);
    }

    @Test
    public void teststudentTitle23() {
        String output = studentTitle.studentTitle(3.33, 65);
        assertEquals("Sinh viên Giỏi", output);
    }

    @Test
    public void teststudentTitle24() {
        String output = studentTitle.studentTitle(3.33, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle25() {
        String output = studentTitle.studentTitle(3.77, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle26() {
        String output = studentTitle.studentTitle(3.77, 32);
        assertEquals("Sinh viên Giỏi", output);
    }

    @Test
    public void teststudentTitle27() {
        String output = studentTitle.studentTitle(3.77, 65);
        assertEquals("Sinh viên Xuất sắc", output);
    }

    @Test
    public void teststudentTitle28() {
        String output = studentTitle.studentTitle(3.77, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle29() {
        String output = studentTitle.studentTitle(5.11, -20);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle30() {
        String output = studentTitle.studentTitle(5.11, 32);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle31() {
        String output = studentTitle.studentTitle(5.11, 65);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void teststudentTitle32() {
        String output = studentTitle.studentTitle(5.11, 114);
        assertEquals("Dữ liệu không hợp lệ", output);
    }
}
