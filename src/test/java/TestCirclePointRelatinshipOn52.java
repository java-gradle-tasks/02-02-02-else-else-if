import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirclePointRelatinshipOn52 {

   @Test
   public void test() {
      Circle circle=new Circle(5,2,3);
      Point point=new Point(2,2);

      MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.ON;
      MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

      Assertions.assertEquals(expected,actual,"A pont a körön esetet nem jól határozta meg!");
   }
}
