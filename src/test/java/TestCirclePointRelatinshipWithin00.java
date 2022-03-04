import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestCirclePointRelatinshipWithin00 {

      @Test
      public void test() {
         Circle circle=new Circle(0,0,1);
         Point point=new Point(0,0);

         MyCircleRelationship.Relationship expected = MyCircleRelationship.Relationship.WITHIN;
         MyCircleRelationship.Relationship actual= MyCircleRelationship.getCirceAndPointRelation(circle,point);

         Assertions.assertEquals(expected,actual,"A pont a korben esetet nem jol hatarozta meg!");
      }
   }
