
# What I am?
A Database which support a specific business data store, query requirement.
As named it, Feed, AKA. UGC(user generated content), data flow. 
Facebook, Twitter, Ins, Weibo are all known as data flow service.

# Feeds
We called data flow as feeds here, How we store our data to support this kind of
service? 
First you need to store the feed content in a well known database such as Mysql, Hbase or even Redis.
then you store the id of the content in FeedBase.
In FeedBase, you can create any number of *IdList* and calculate then fast.
Feedbase also provide *Counter* function. For example, you need to know the number of comment of a feed or 
the number of the like of a feed.

# What Problem I can solve?
If you develop a feed service with MySql, Hbase or other general data store database,
Quick feeds service development,

# How do I solve these problems? What data model and ability do I provide?
We abstract the business logical and make this database,
 
# A little more
If your application's data no so much, considering the cost of storage, you can choice
to store data in local file system. With your application's data grow up, you can store data
in a distributed file system like HDFS. If you do not like file storage, MySql, Hbase and Redis storage
are also supported, all you need to do is provide the configuration. 