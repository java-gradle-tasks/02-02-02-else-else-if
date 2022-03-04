import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirclePointRelatinshipOn00 {

   @Test
   public void test() {
      Circle circle=new Circle(0,0,1);
      Point point=new Point(0,1);

      MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.ON;
      MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

      Assertions.assertEquals(expected,actual,"A pont a koron esetet nem jol hatarozta meg.");
   }
}
