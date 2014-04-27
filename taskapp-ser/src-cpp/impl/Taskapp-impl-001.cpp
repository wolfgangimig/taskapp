#include "Taskapp-impl.h"
using namespace ::std;
using namespace ::byps;

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1252554176(BIO& bio, POBJECT& pObj, PSerializable& , void* ) {
	void* p = pObj.get();
	if (p) { 
		::std::map< ::std::wstring , ::std::wstring >& r = * reinterpret_cast< ::std::map< ::std::wstring , ::std::wstring >*>(p);
		bio & r;
	} else {
		pObj = POBJECT(new ::std::map< ::std::wstring , ::std::wstring >());
	}
}
}}
// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1218831438(BIO& bio, POBJECT& pObj, PSerializable& , void* ) {
	void* p = pObj.get();
	if (p) { 
		::std::vector< PContentStream >& r = * reinterpret_cast< ::std::vector< PContentStream >*>(p);
		bio & r;
	} else {
		pObj = POBJECT(new ::std::vector< PContentStream >());
	}
}
}}
// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1182472339(BIO& bio, POBJECT& pObj, PSerializable& , void* ) {
	void* p = pObj.get();
	if (p) { 
		::std::vector< task::app::PTaskInfo >& r = * reinterpret_cast< ::std::vector< task::app::PTaskInfo >*>(p);
		bio & r;
	} else {
		pObj = POBJECT(new ::std::vector< task::app::PTaskInfo >());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BRequest_TaskNotify_receiveTask
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:489
BRequest_TaskNotify_receiveTask::BRequest_TaskNotify_receiveTask() : BMethodRequest(265418285) {
}
// checkpoint byps.gen.cpp.GenApiClass:536
task::app::BRequest_TaskNotify_receiveTask::BRequest_TaskNotify_receiveTask(const PTaskInfo& task)
	: BMethodRequest(265418285) 
	, task(task)
	{}
// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BRequest_TaskNotify_receiveTask::serialize(BIO& ar, const BVERSION version) {
	ar & this->task;
}
void task::app::BRequest_TaskNotify_receiveTask::execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult) {
	PTaskNotify __byps__remoteT = byps_ptr_cast<TaskNotify>(__byps__remote);
	__byps__remoteT->receiveTask(task, [__byps__asyncResult](int32_t __byps__result, BException __byps__ex) {
		if (__byps__ex) {
			__byps__asyncResult->setAsyncResult(BVariant(__byps__ex));
		}
		else {
			PSerializable __byps__methodResult(new BResult_5(__byps__result));
			__byps__asyncResult->setAsyncResult(BVariant(__byps__methodResult));
		}
	});
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_484377997(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BRequest_TaskNotify_receiveTask& r = * dynamic_cast< task::app::BRequest_TaskNotify_receiveTask*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BRequest_TaskNotify_receiveTask());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BRequest_TaskService_addTask
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:489
BRequest_TaskService_addTask::BRequest_TaskService_addTask() : BMethodRequest(216769899) {
}
// checkpoint byps.gen.cpp.GenApiClass:536
task::app::BRequest_TaskService_addTask::BRequest_TaskService_addTask(const PTaskInfo& task)
	: BMethodRequest(216769899) 
	, task(task)
	{}
// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BRequest_TaskService_addTask::serialize(BIO& ar, const BVERSION version) {
	ar & this->task;
}
void task::app::BRequest_TaskService_addTask::execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult) {
	PTaskService __byps__remoteT = byps_ptr_cast<TaskService>(__byps__remote);
	__byps__remoteT->addTask(task, [__byps__asyncResult](bool __byps__result, BException __byps__ex) {
		if (__byps__ex) {
			__byps__asyncResult->setAsyncResult(BVariant(__byps__ex));
		}
		else {
			PSerializable __byps__methodResult(new BResult_19(__byps__result));
			__byps__asyncResult->setAsyncResult(BVariant(__byps__methodResult));
		}
	});
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1498136965(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BRequest_TaskService_addTask& r = * dynamic_cast< task::app::BRequest_TaskService_addTask*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BRequest_TaskService_addTask());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BRequest_TaskService_getTasks
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:489
BRequest_TaskService_getTasks::BRequest_TaskService_getTasks() : BMethodRequest(216769899) {
}
// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BRequest_TaskService_getTasks::serialize(BIO& ar, const BVERSION version) {
}
void task::app::BRequest_TaskService_getTasks::execute(PRemote __byps__remote, PAsyncResult __byps__asyncResult) {
	PTaskService __byps__remoteT = byps_ptr_cast<TaskService>(__byps__remote);
	__byps__remoteT->getTasks([__byps__asyncResult](PVectorTaskInfo __byps__result, BException __byps__ex) {
		if (__byps__ex) {
			__byps__asyncResult->setAsyncResult(BVariant(__byps__ex));
		}
		else {
			PSerializable __byps__methodResult(new BResult_1182472339(__byps__result));
			__byps__asyncResult->setAsyncResult(BVariant(__byps__methodResult));
		}
	});
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_280075325(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BRequest_TaskService_getTasks& r = * dynamic_cast< task::app::BRequest_TaskService_getTasks*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BRequest_TaskService_getTasks());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BResult_1182472339
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BResult_1182472339::serialize(BIO& ar, const BVERSION version) {
	ar & this->result;
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_2101800006(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BResult_1182472339& r = * dynamic_cast< task::app::BResult_1182472339*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BResult_1182472339());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BResult_19
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BResult_19::serialize(BIO& ar, const BVERSION version) {
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1766349022(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BResult_19& r = * dynamic_cast< task::app::BResult_19*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BResult_19());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class BResult_5
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::BResult_5::serialize(BIO& ar, const BVERSION version) {
	ar & this->result;
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_195526335(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::BResult_5& r = * dynamic_cast< task::app::BResult_5*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::BResult_5());
	}
}
}}
namespace task { namespace app { 

//-------------------------------------------------
// Implementation of class TaskInfo
// Generated from class byps.gen.cpp.GenApiClass

// checkpoint byps.gen.cpp.GenApiClass:489
TaskInfo::TaskInfo() {
	id = 0;
}
// checkpoint byps.gen.cpp.GenApiClass:536
task::app::TaskInfo::TaskInfo(int32_t id, const ::std::wstring& userName, const byps::PMapStringString& properties, const BDateTime& dueDate, const ::std::wstring& todo, const byps::PVectorInputStream& attachments)
	: id(id)
	, userName(userName)
	, properties(properties)
	, dueDate(dueDate)
	, todo(todo)
	, attachments(attachments)
	{}
void TaskInfo::setId(int32_t v) {
	id = v;
}
void TaskInfo::setUserName(::std::wstring v) {
	userName = v;
}
void TaskInfo::setProperties(byps::PMapStringString v) {
	properties = v;
}
void TaskInfo::setDueDate(BDateTime v) {
	dueDate = v;
}
void TaskInfo::setTodo(::std::wstring v) {
	todo = v;
}
void TaskInfo::setAttachments(byps::PVectorInputStream v) {
	attachments = v;
}
// checkpoint byps.gen.cpp.GenApiClass:877
void task::app::TaskInfo::serialize(BIO& ar, const BVERSION version) {
	ar & this->dueDate;
	ar & this->id;
	ar & this->todo;
	ar & this->userName;
	if (version >= 100000000000001) {
		ar & this->attachments;
		ar & this->properties;
	}
}
}}

// checkpoint byps.gen.cpp.GenApiClass:934
namespace task { namespace app { 
void BSerializer_1660464439(BIO& bio, POBJECT& , PSerializable& pObjS, void* pBase) {
	BSerializable* p = pBase ? reinterpret_cast<BSerializable*>(pBase) : pObjS.get();
	if (p) { 
		task::app::TaskInfo& r = * dynamic_cast< task::app::TaskInfo*>(p);
		bio & r;
	} else {
		pObjS = PSerializable(new task::app::TaskInfo());
	}
}
}}

namespace task { namespace app { 

int32_t BSkeleton_TaskNotify::receiveTask(const PTaskInfo& task)  {
	throw BException(BExceptionC::UNSUPPORTED_METHOD, L"");
}
void BSkeleton_TaskNotify::receiveTask(const PTaskInfo& task, ::std::function< void (int32_t, BException ex) > asyncResult)  {
	int32_t __byps__ret = int32_t();
	try {
		__byps__ret = receiveTask(task);
		asyncResult(__byps__ret, BException());
	} catch (const std::exception& __byps__ex) {
		asyncResult(__byps__ret, __byps__ex);
	}
}
}}



namespace task { namespace app { 
BStub_TaskNotify::BStub_TaskNotify(PTransport transport) 
	: BStub(transport) {}
}}

namespace task { namespace app { 
int32_t BStub_TaskNotify::receiveTask(const PTaskInfo& task)  {
	BSyncResultT< int32_t > syncResult;	
	receiveTask(task, [&syncResult](int32_t v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_TaskNotify::receiveTask(const PTaskInfo& task, ::std::function< void (int32_t, BException ex) > asyncResult)  {
	PMethodRequest req(new BRequest_TaskNotify_receiveTask(task));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< int32_t, BResult_5 >(asyncResult) );
	transport->sendMethod(req, outerResult);
}
}}

// checkpoint byps.gen.cpp.GenRemoteStub:224
namespace task { namespace app { 
void BSerializer_265418285(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new task::app::BStub_TaskNotify(transport));
	}
	else {
		BRemote* r = dynamic_cast<BRemote*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}



namespace task { namespace app { 
BStub_TaskService::BStub_TaskService(PTransport transport) 
	: BStub(transport) {}
}}

namespace task { namespace app { 
void BStub_TaskService::addTask(const PTaskInfo& task)  {
	BSyncResultT< bool > syncResult;	
	addTask(task, [&syncResult](bool v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	syncResult.getResult();
}
void BStub_TaskService::addTask(const PTaskInfo& task, ::std::function< void (bool, BException ex) > asyncResult)  {
	PMethodRequest req(new BRequest_TaskService_addTask(task));
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< bool, BResult_19 >(asyncResult) );
	transport->sendMethod(req, outerResult);
}
}}

namespace task { namespace app { 
PVectorTaskInfo BStub_TaskService::getTasks()  {
	BSyncResultT< PVectorTaskInfo > syncResult;	
	getTasks([&syncResult](PVectorTaskInfo v, BException ex) {
		syncResult.setAsyncResult(v, ex);
	});
	return syncResult.getResult();
}
void BStub_TaskService::getTasks(::std::function< void (PVectorTaskInfo, BException ex) > asyncResult)  {
	PMethodRequest req(new BRequest_TaskService_getTasks());
	PAsyncResult outerResult( new BAsyncResultReceiveMethodL< PVectorTaskInfo, BResult_1182472339 >(asyncResult) );
	transport->sendMethod(req, outerResult);
}
}}

// checkpoint byps.gen.cpp.GenRemoteStub:224
namespace task { namespace app { 
void BSerializer_216769899(BIO& bio, POBJECT& , PSerializable& pObjS, void* ){
	BSerializable* p = pObjS.get();
	if (bio.is_loading) {
		if (p) return;
		BTargetId targetId;
		bio & targetId;
		PTransport transport(new BTransport(*bio.transport, targetId));
		pObjS = PSerializable(new task::app::BStub_TaskService(transport));
	}
	else {
		BRemote* r = dynamic_cast<BRemote*>(p);
		BTargetId targetId = r->BRemote_getTargetId();
		bio & targetId;
	}
}
}}

//-------------------------------------------------
// Registry 

task::app::BRegistry_Taskapp::BRegistry_Taskapp()
{
	registerClass(typeid(::std::map< ::std::wstring , ::std::wstring >), task::app::BSerializer_1252554176, 1252554176);
	registerClass(typeid(::std::vector< PContentStream >), task::app::BSerializer_1218831438, 1218831438);
	registerClass(typeid(::std::vector< task::app::PTaskInfo >), task::app::BSerializer_1182472339, 1182472339);
	registerClass(typeid(task::app::BRequest_TaskNotify_receiveTask), task::app::BSerializer_484377997, 484377997);
	registerClass(typeid(task::app::BRequest_TaskService_addTask), task::app::BSerializer_1498136965, 1498136965);
	registerClass(typeid(task::app::BRequest_TaskService_getTasks), task::app::BSerializer_280075325, 280075325);
	registerClass(typeid(task::app::BResult_1182472339), task::app::BSerializer_2101800006, 2101800006);
	registerClass(typeid(task::app::BResult_19), task::app::BSerializer_1766349022, 1766349022);
	registerClass(typeid(task::app::BResult_5), task::app::BSerializer_195526335, 195526335);
	registerClass(typeid(task::app::BStub_TaskNotify), task::app::BSerializer_265418285, 265418285);
	registerClass(typeid(task::app::BStub_TaskService), task::app::BSerializer_216769899, 216769899);
	registerClass(typeid(task::app::TaskInfo), task::app::BSerializer_1660464439, 1660464439);
}
namespace task { namespace app { 

PApiDescriptor BApiDescriptor_Taskapp::instance() {
	return PApiDescriptor((new BApiDescriptor(
	"Taskapp",
	"task.app",
	VERSION,
	false)) // uniqueObjects
	->addRegistry(PRegistry(new BRegistry_Taskapp()))
	);
};

}}

namespace task { namespace app { 

PClient_Taskapp BClient_Taskapp::createClient(PTransportFactory transportFactory) {
	return PClient_Taskapp(new BClient_Taskapp(transportFactory));
}
PClient_Taskapp BClient_Taskapp::createClientR(PTransport transport) {
	return PClient_Taskapp(new BClient_Taskapp(transport));
}
void BClient_Taskapp::addRemote(PSkeleton_TaskNotify remoteSkeleton) {
	if (!serverR) throw BException(BExceptionC::NO_REVERSE_CONNECTIONS, L"No reverse connections.");
	serverR->server->addRemote(265418285, remoteSkeleton);
}

BClient_Taskapp::BClient_Taskapp(PTransportFactory transportFactory) 
	: BClient(
		transportFactory->createClientTransport(), 
		transportFactory->createServerR(
			BServer_Taskapp::createServerR(transportFactory->createServerTransport())
		)
	)
	{
	initStubs(transport);
}
BClient_Taskapp::BClient_Taskapp(PTransport transport) 
	: BClient(transport, NULL)
	{
	initStubs(transport);
}
BINLINE task::app::PTaskNotify BClient_Taskapp::getTaskNotify() {
	return taskNotify;
}
BINLINE task::app::PTaskService BClient_Taskapp::getTaskService() {
	return taskService;
}
PRemote BClient_Taskapp::getStub(int remoteId) {
	if (remoteId == 265418285) return taskNotify;
	if (remoteId == 216769899) return taskService;
	return PRemote();
}
BINLINE void BClient_Taskapp::initStubs(PTransport transport) {
	taskNotify = task::app::PTaskNotify(new BStub_TaskNotify(transport));
	taskService = task::app::PTaskService(new BStub_TaskService(transport));
}
}}

namespace task { namespace app { 

PServer_Taskapp BServer_Taskapp::createServer(PTransportFactory transportFactory) {
	return PServer_Taskapp(new BServer_Taskapp(transportFactory));
}
PServer_Taskapp BServer_Taskapp::createServerR(PTransport transport) {
	return PServer_Taskapp(new BServer_Taskapp(transport));
}
void BServer_Taskapp::addRemote(PSkeleton_TaskNotify remoteSkeleton) {
	BServer::addRemote(265418285, remoteSkeleton);
}

BServer_Taskapp::BServer_Taskapp(PTransportFactory transportFactory) 
	: BServer(
		transportFactory->createServerTransport(), 
		transportFactory->createClientR(
			BClient_Taskapp::createClientR(transportFactory->createClientTransport())
		)
	)
	{
}
BServer_Taskapp::BServer_Taskapp(PTransport transport) 
	: BServer(transport, NULL)
	{
}
}}

