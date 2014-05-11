#ifndef __Taskapp_impl_H__
#define __Taskapp_impl_H__

#include <Byps-impl.h>
#include <Taskapp-api.h>


//-------------------------------------------------
// BRequest_CalculationService_computeSimpleChecksum
// typeId=700141099

namespace task { namespace app { 

using namespace ::byps;

class BRequest_CalculationService_computeSimpleChecksum : public BMethodRequest {
	public: byps::PVectorInputStream streams;
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_CalculationService_computeSimpleChecksum();
	// checkpoint byps.gen.cpp.GenApiClass:535
	public: BRequest_CalculationService_computeSimpleChecksum(const byps::PVectorInputStream& streams);	
	public: virtual BTYPEID BSerializable_getTypeId() { return 700141099; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
	public: virtual void execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult);
};

}}

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
// BRequest_TaskService_getCalculationService
// typeId=1708052887

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskService_getCalculationService : public BMethodRequest {
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskService_getCalculationService();
	
	public: virtual BTYPEID BSerializable_getTypeId() { return 1708052887; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
	public: virtual void execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult);
};

}}

//-------------------------------------------------
// BRequest_TaskService_getTaskAttachments
// typeId=708578592

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskService_getTaskAttachments : public BMethodRequest {
	public: int32_t taskId;
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskService_getTaskAttachments();
	// checkpoint byps.gen.cpp.GenApiClass:535
	public: BRequest_TaskService_getTaskAttachments(int32_t taskId);	
	public: virtual BTYPEID BSerializable_getTypeId() { return 708578592; }
	
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
// BRequest_TaskService_registerCalculationService
// typeId=1221550298

namespace task { namespace app { 

using namespace ::byps;

class BRequest_TaskService_registerCalculationService : public BMethodRequest {
	public: PCalculationService calc;
	
	// checkpoint byps.gen.cpp.GenApiClass:488
	public: BRequest_TaskService_registerCalculationService();
	// checkpoint byps.gen.cpp.GenApiClass:535
	public: BRequest_TaskService_registerCalculationService(const PCalculationService& calc);	
	public: virtual BTYPEID BSerializable_getTypeId() { return 1221550298; }
	
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
// BResult_1218831438
// typeId=2083176447

namespace task { namespace app { 

using namespace ::byps;

class BResult_1218831438 : public BSerializable {
	public: byps::PVectorInputStream result;
	// checkpoint byps.gen.cpp.GenApiClass:473
	public: BResult_1218831438(byps::PVectorInputStream result = byps::PVectorInputStream()) : result(result) {}	
	public: virtual BTYPEID BSerializable_getTypeId() { return 2083176447; }
	
	// checkpoint byps.gen.cpp.GenApiClass:871
	public: void serialize(BIO& ar, const BVERSION version);
};

}}

//-------------------------------------------------
// BResult_1645863102
// typeId=1845687418

namespace task { namespace app { 

using namespace ::byps;

class BResult_1645863102 : public BSerializable {
	public: task::app::PCalculationService result;
	// checkpoint byps.gen.cpp.GenApiClass:473
	public: BResult_1645863102(task::app::PCalculationService result = task::app::PCalculationService()) : result(result) {}	
	public: virtual BTYPEID BSerializable_getTypeId() { return 1845687418; }
	
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
// Serializer for task.app.BRequest_CalculationService_computeSimpleChecksum
void BSerializer_700141099(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskNotify_receiveTask
void BSerializer_484377997(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_addTask
void BSerializer_1498136965(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_getCalculationService
void BSerializer_1708052887(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_getTaskAttachments
void BSerializer_708578592(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_getTasks
void BSerializer_280075325(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BRequest_TaskService_registerCalculationService
void BSerializer_1221550298(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_1182472339
void BSerializer_2101800006(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_1218831438
void BSerializer_2083176447(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_1645863102
void BSerializer_1845687418(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_19
void BSerializer_1766349022(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BResult_5
void BSerializer_195526335(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BStub_CalculationService
void BSerializer_1984352081(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BStub_TaskNotify
void BSerializer_265418285(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.BStub_TaskService
void BSerializer_216769899(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);
// Serializer for task.app.TaskInfo
void BSerializer_1660464439(BIO& bio, POBJECT& pObj, PSerializable& pObjS, void* pBase);

}}


#endif
