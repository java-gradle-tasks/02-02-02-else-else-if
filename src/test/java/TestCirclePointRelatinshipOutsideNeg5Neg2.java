import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirclePointRelatinshipOutsideNeg5Neg2 {

   @Test
   public void test() {
      Circle circle=new Circle(-5,-2,3);
      Point point=new Point(3,1);

      MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.OUTSIDE;
      MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

      Assertions.assertEquals(expected,actual,"A pont a koron kivul esetet nem jol hatorzta meg!");
   }
}
