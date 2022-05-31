

import org.junit.Assert;
import org.testng.annotations.Test;

public class Test_Setting_Name_LastName_Email extends BaseTest{


@Test
    public void setName() {
    practiceFormPage.setName("Eloa");
    Assert.assertEquals("Name value is not correct","Eloa", practiceFormPage.getName());
}
@Test
    public void setLastName() {
    practiceFormPage.setLastName("swan");


}
    @Test
    public void setEmail() {
        practiceFormPage.setEmail("eloaswan@gmail.com");

    }


}
