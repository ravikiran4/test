
First Map Reduce job:

public class CustomPartitioner1 extends Partitioner<Text, Text>
{
  @Override
  public int getPartition(CustomKeyClass key, Text value, int numtasks)
  {
    int u = key.getProblemId().hashCode();
    return u%numtasks;
  }
}
//job.setNumReduceTasks(3);






Second Map Reduce job:

public class CustomPartitioner2 extends Partitioner<Text, Text>
{
  @Override
  public int getPartition(CustomKeyClass key, Text value, int numtasks)
  {
    String str = key.getClassName();
    if(str.equals("Y"))
      return 0;
    else
      return 1;
  }
}
job.setNumReduceTasks(2);
