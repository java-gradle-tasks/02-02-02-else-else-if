import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCircleCirclePointRelatinshipOutsideOn {

   @Test
   public void test() {
      Circle second=new Circle(0,0,1);
      Circle first=new Circle(2.5,2.5,1);
      Point point=new Point(1,0);

      ReletionshipCircleCirclePoint expected=new ReletionshipCircleCirclePoint();
      expected.firstCircle=MyCircleRelationship.Relationship.OUTSIDE;
      expected.secondCircle=MyCircleRelationship.Relationship.ON;

      ReletionshipCircleCirclePoint actual= MyCircleRelationship.getCirceCircleAndPointRelation(first,second,point);

      Assertions.assertEquals(expected.firstCircle,actual.firstCircle,"Az elso pont es kor helyzetet rosszul hatarozta meg!");
      Assertions.assertEquals(expected.secondCircle,actual.secondCircle,"A masodik pont es kor helyzetet rosszul hatarozta meg!");
   }
}
