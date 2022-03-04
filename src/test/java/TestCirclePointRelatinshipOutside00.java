import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirclePointRelatinshipOutside00 {

   @Test
   public void test() {
      Circle circle=new Circle(0,0,1);
      Point point=new Point(2,1);

      MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.OUTSIDE;
      MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

      Assertions.assertEquals(expected,actual,"A pont a koron kivul esetet nem jol hatorzta meg!");
   }
}
