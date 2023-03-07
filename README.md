# HBL1CachingApp

Caching
=======
=>It is a temporoary memory that holds the data for temporary period of time.
=> Cache at client side will hold server data and uses it across the mulitple
same requests to reduce the network trip
b/w client and server.
=> Hibernate supports 2 levels of Cache
a. First Level Cache(L-1 cache/session cache/default cache)
b. Second Level Cache(L2- cache/configurable cache)

eg: Stockmarket trading,live game score,weather report,......

Note:
session.save(obj),session.saveOrUpdate(obj),sesssion.delete(obj) methods keep the
object in L1cache unitll
tx.commit() is called.
session.get() will get the object and keep it in L-1 cache and same object will be
used across mulitple session.get() method
calls with same entity object id.
Caching
a. evict(Object obj) => it will remove particular object from L1-cache
b. clear() -> it will remove all object present in L1-cache.
c. In L1-cache, duplicate objects won't be available.
