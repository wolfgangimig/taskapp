﻿#ifndef __Taskapp_impl_H__
#define __Taskapp_impl_H__

#include <Byps-impl.h>
#include <Taskapp-api.h>


//-------------------------------------------------
// BRequest_TaskNotify_receiveTask
// typeId=484377997

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskNotify_receiveTask : public BMethodRequest {
	public: PTaskInfo task;
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskNotify_receiveTask();
	// checkpoint byps.gen.cpp.GenApiClass:535
	public: BRequest_TaskNotify_receiveTask(const PTaskInfo& task);	
	public: virtual BTYPEID BSerializable_getTypeId() { return 484377997; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
	public: virtual void execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult);
};

}}

//-------------------------------------------------
// BRequest_TaskService_addTask
// typeId=1498136965

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskService_addTask : public BMethodRequest {
	public: PTaskInfo task;
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskService_addTask();
	// checkpoint byps.gen.cpp.GenApiClass:535
	public: BRequest_TaskService_addTask(const PTaskInfo& task);	
	public: virtual BTYPEID BSerializable_getTypeId() { return 1498136965; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
	public: virtual void execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult);
};

}}

//-------------------------------------------------
// BRequest_TaskService_getTasks
// typeId=280075325

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskService_getTasks : public BMethodRequest {
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskService_getTasks();
	
	public: virtual BTYPEID BSerializable_getTypeId() { return 280075325; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
	public: virtual void execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult);
};

}}

//-------------------------------------------------
// BResult_1182472339
// typeId=2101800006

namespace task { namespace app { 

using namespace ::byps;

class BResult_1182472339 : public BSerializable {
	public: task::app::PVectorTaskInfo result;
	// checkpoint byps.gen.cpp.GenApiClass:473
	public: BResult_1182472339(task::app::PVectorTaskInfo result = task::app::PVectorTaskInfo()) : result(result) {}	
	public: virtual BTYPEID BSerializable_getTypeId() { return 2101800006; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
};

}}

//-------------------------------------------------
// BResult_19
// typeId=1766349022

namespace task { namespace app { 

using namespace ::byps;

class BResult_19 : public BSerializable {
	public: bool result;
	// checkpoint byps.gen.cpp.GenApiClass:473
	public: BResult_19(bool result = bool()) : result(result) {}	
	public: virtual BTYPEID BSerializable_getTypeId() { return 1766349022; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
};

}}

//-------------------------------------------------
// BResult_5
// typeId=195526335

namespace task { namespace app { 

using namespace ::byps;

class BResult_5 : public BSerializable {
	public: int32_t result;
	// checkpoint byps.gen.cpp.GenApiClass:473
	public: BResult_5(int32_t result = int32_t()) : result(result) {}	
	public: virtual BTYPEID BSerializable_getTypeId() { return 195526335; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
};

}}

namespace task { namespace app { 

// Serializer for java.util.HashMap<java.lang.String,java.lang.String>
void BSerializer_1252554176(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for java.util.List<java.io.InputStream>
void BSerializer_1218831438(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for java.util.List<task.app.TaskInfo>
void BSerializer_1182472339(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskNotify_receiveTask
void BSerializer_484377997(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_addTask
void BSerializer_1498136965(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_getTasks
void BSerializer_280075325(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_1182472339
void BSerializer_2101800006(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_19
void BSerializer_1766349022(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_5
void BSerializer_195526335(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BStub_TaskNotify
void BSerializer_265418285(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BStub_TaskService
void BSerializer_216769899(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.TaskInfo
void BSerializer_1660464439(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);

}}


#endif
