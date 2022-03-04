import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCircleCirclePointRelatinshipOutsideOutside {

   @Test
   public void test() {
      Circle second=new Circle(5,5,3.5);
      Circle first=new Circle(2.5,2.5,0.2);
      Point point=new Point(1,0);

      ReletionshipCircleCirclePoint expected=new ReletionshipCircleCirclePoint();
      expected.firstCircle=MyCircleRelationship.Relationship.OUTSIDE;
      expected.secondCircle=MyCircleRelationship.Relationship.OUTSIDE;

      ReletionshipCircleCirclePoint actual= MyCircleRelationship.getCirceCircleAndPointRelation(first,second,point);

      Assertions.assertEquals(expected.firstCircle,actual.firstCircle,"Az elso pont es kor helyzetet rosszul hatarozta meg!");
      Assertions.assertEquals(expected.secondCircle,actual.secondCircle,"A masodik pont es kor helyzetet rosszul hatarozta meg!");
   }
}
