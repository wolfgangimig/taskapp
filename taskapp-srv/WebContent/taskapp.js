/**
 * ----------------------------------------------
 * Declare packages.
 * ----------------------------------------------
*/
var task = task || {};
task.app = task.app || {};

/**
 * ----------------------------------------------
 * API Descriptor
 * ----------------------------------------------
*/
task.app.BApiDescriptor_Taskapp = {
	/**
	 * API serialisation version: 1.0.0.1
	 */
	VERSION : "1.0.0.1",
	
	/**
	 * Internal used API Desciptor.
	*/
	instance : function() {
		return new byps.BApiDescriptor(
			"Taskapp",
			"task.app",
			"1.0.0.1",
			false, // uniqueObjects
			new task.app.BRegistry_Taskapp()
		);
	}
};


/**
 * ----------------------------------------------
 * Client class
 * ----------------------------------------------
*/

task.app.createClient_Taskapp = function(transportFactory) {
	return new task.app.BClient_Taskapp(transportFactory);
};

task.app.BClient_Taskapp = function(transportFactory) { 

	this.transport = transportFactory.createClientTransport();
	
	this._serverR = transportFactory.createServerR(
		new task.app.BServer_Taskapp(transportFactory.createServerTransport())
	);
	
	this.calculationService = new task.app.BStub_CalculationService(this.transport);
	this.taskNotify = new task.app.BStub_TaskNotify(this.transport);
	this.taskService = new task.app.BStub_TaskService(this.transport);
};
task.app.BClient_Taskapp.prototype = new byps.BClient();


/**
 * ----------------------------------------------
 * API value classes
 * ----------------------------------------------
*/

/**
*/
task.app.TaskInfo = function(id, userName, properties, dueDate, todo, attachments) {
	this._typeId = 1660464439;
	this.id = id || 0;
	this.userName = userName || "";
	this.properties = properties || null;
	this.dueDate = dueDate || null;
	this.todo = todo || "";
	this.attachments = attachments || null;
};



/**
 * ----------------------------------------------
 * API constant types
 * ----------------------------------------------
*/


/**
 * ----------------------------------------------
 * API constants
 * ----------------------------------------------
*/


/**
 * ----------------------------------------------
 * Skeleton classes
 * ----------------------------------------------
*/

/**
 * This class provides a skeleton implementation of the interface TaskNotify.
 * Use an object of this class as the prototype of your interface implementation.
 * Either provide an asynchronous or a synchronous function in your implementation.
 * The framework calls only the asynchronous function.
 */
task.app.BSkeleton_TaskNotify = function() {
	
	this._typeId = 265418285;
	
	this.transport = null; // is set in BServer.addRemote
	
	this.toJSON = function (key) {
		return { _typeId : 265418285, targetId : this.transport.targetId };
	};
	
	
};

// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BSkeleton_TaskNotify.prototype.receiveTask = function(task) /* returns int , throws BException, InterruptedException*/  {
	byps.throwUNSUPPORTED("");
};
// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BSkeleton_TaskNotify.prototype.async_receiveTask = function(task, __byps__asyncResult){
	try {
		var __byps__ret = this.receiveTask(task);
		__byps__asyncResult(__byps__ret, null);
	} catch (e) {
		__byps__asyncResult(null, e);
	};
};


/**
 * ----------------------------------------------
 * Stub classes
 * ----------------------------------------------
*/

/**
 * @since 1.0.0.1
 * @since 1.0.0.1
*/
task.app.BStub_CalculationService = function(transport) {
	
	this._typeId = 1984352081;
	
	this.transport = transport;
	
};

// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BStub_CalculationService.prototype.computeSimpleChecksum = function(streams, __byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 700141099, streams : streams };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

/**
 * @BClientRemote 
 * @since 1.0.0.1
 * @BClientRemote 
 * @since 1.0.0.1
*/
task.app.BStub_TaskNotify = function(transport) {
	
	this._typeId = 265418285;
	
	this.transport = transport;
	
};

// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BStub_TaskNotify.prototype.receiveTask = function(task, __byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 484377997, task : task };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

/**
*/
task.app.BStub_TaskService = function(transport) {
	
	this._typeId = 216769899;
	
	this.transport = transport;
	
};

// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BStub_TaskService.prototype.addTask = function(task, __byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 1498136965, task : task };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

// checkpoint byps.gen.js.PrintContext:133
/**
*/
task.app.BStub_TaskService.prototype.getTasks = function(__byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 280075325 };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

// checkpoint byps.gen.js.PrintContext:133
/**
 * @since 1.0.0.1
*/
task.app.BStub_TaskService.prototype.registerCalculationService = function(calc, __byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 1221550298, calc : calc };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

// checkpoint byps.gen.js.PrintContext:133
/**
 * @since 1.0.0.1
*/
task.app.BStub_TaskService.prototype.getCalculationService = function(__byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 1708052887 };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};

// checkpoint byps.gen.js.PrintContext:133
/**
 * @since 1.0.0.1
*/
task.app.BStub_TaskService.prototype.getTaskAttachments = function(taskId, __byps__asyncResult) {
	// checkpoint byps.gen.js.GenRemoteStub:40
	var req =  { _typeId : 708578592, taskId : taskId };
	var ret = this.transport.sendMethod(req, __byps__asyncResult);
	return ret;
};


/**
 * ----------------------------------------------
 * Server class
 * ----------------------------------------------
*/

task.app.BServer_Taskapp = function(transport) { 

	this.transport = transport;
	this._remotes = {};
	
	this._methodMap = {
		
		// Remote Interface CalculationService			
			// Method computeSimpleChecksum
			700141099 : [ // _typeId of request class
				1984352081, // _typeId of remote interface
				195526335, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_computeSimpleChecksum(methodObj.streams, methodResult);
				}
			],
		
		
		// Remote Interface TaskNotify			
			// Method receiveTask
			484377997 : [ // _typeId of request class
				265418285, // _typeId of remote interface
				195526335, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_receiveTask(methodObj.task, methodResult);
				}
			],
		
		
		// Remote Interface TaskService			
			// Method addTask
			1498136965 : [ // _typeId of request class
				216769899, // _typeId of remote interface
				1766349022, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_addTask(methodObj.task, methodResult);
				}
			],
			
			// Method getTasks
			280075325 : [ // _typeId of request class
				216769899, // _typeId of remote interface
				2101800006, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_getTasks(methodResult);
				}
			],
			
			// Method registerCalculationService
			1221550298 : [ // _typeId of request class
				216769899, // _typeId of remote interface
				1766349022, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_registerCalculationService(methodObj.calc, methodResult);
				}
			],
			
			// Method getCalculationService
			1708052887 : [ // _typeId of request class
				216769899, // _typeId of remote interface
				1845687418, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_getCalculationService(methodResult);
				}
			],
			
			// Method getTaskAttachments
			708578592 : [ // _typeId of request class
				216769899, // _typeId of remote interface
				2083176447, // _typeId of result class
				function(remote, methodObj, methodResult) {
					remote.async_getTaskAttachments(methodObj.taskId, methodResult);
				}
			],
		
	};
};
task.app.BServer_Taskapp.prototype = new byps.BServer();


/**
 * ----------------------------------------------
 * Registry
 * ----------------------------------------------
*/

task.app.BRegistry_Taskapp = function() { 
	
	this._serializerMap = {
		
		// java.util.HashMap<String,String>
		1252554176 : new byps.BSerializerMap(
			10 // Element type: String
		),
		
		// java.util.List<java.io.InputStream>
		1218831438 : new byps.BSerializerArray(
			15, // Element type: java.io.InputStream
			1
		),
		
		// java.util.List<task.app.TaskInfo>
		1182472339 : new byps.BSerializerArray(
			1660464439, // Element type: task.app.TaskInfo
			1
		),
		
		// task.app.BRequest_CalculationService_computeSimpleChecksum
		700141099 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"streams":1218831438 // java.util.List<java.io.InputStream>
			},
			// checkpoint byps.gen.js.GenRegistry:138
			// names of inline elements
			{
				"streams":1218831438 // java.util.List<java.io.InputStream>
			},
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskNotify_receiveTask
		484377997 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"task":1660464439 // task.app.TaskInfo
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskService_addTask
		1498136965 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"task":1660464439 // task.app.TaskInfo
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskService_getCalculationService
		1708052887 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskService_getTaskAttachments
		708578592 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"taskId":5 // int
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskService_getTasks
		280075325 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BRequest_TaskService_registerCalculationService
		1221550298 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"calc":1984352081 // task.app.CalculationService
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BResult_1182472339
		2101800006 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"result":1182472339 // java.util.List<task.app.TaskInfo>
			},
			// checkpoint byps.gen.js.GenRegistry:138
			// names of inline elements
			{
				"result":1182472339 // java.util.List<task.app.TaskInfo>
			},
			// inlineInstance
			false
		),
		
		// task.app.BResult_1218831438
		2083176447 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"result":1218831438 // java.util.List<java.io.InputStream>
			},
			// checkpoint byps.gen.js.GenRegistry:138
			// names of inline elements
			{
				"result":1218831438 // java.util.List<java.io.InputStream>
			},
			// inlineInstance
			false
		),
		
		// task.app.BResult_1645863102
		1845687418 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"result":1984352081 // task.app.CalculationService
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BResult_19
		1766349022 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"result":19 // void
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BResult_5
		195526335 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"result":5 // int
			},
			// checkpoint byps.gen.js.GenRegistry:138
			null,
			// inlineInstance
			false
		),
		
		// task.app.BStub_CalculationService
		1984352081 : new byps.BSerializerRemote(task.app.BStub_CalculationService),
		
		// task.app.BStub_TaskNotify
		265418285 : new byps.BSerializerRemote(task.app.BStub_TaskNotify),
		
		// task.app.BStub_TaskService
		216769899 : new byps.BSerializerRemote(task.app.BStub_TaskService),
		
		// task.app.TaskInfo
		1660464439 : new byps.BSerializer(
			// checkpoint byps.gen.js.GenRegistry:138
			// names of persistent elements
			{
				"id":5, // int
				// names of persistent elements
				"userName":10, // java.lang.String
				// names of persistent elements
				"properties":1252554176, // java.util.HashMap<java.lang.String,java.lang.String>
				// names of persistent elements
				"dueDate":17, // java.util.Date
				// names of persistent elements
				"todo":10, // java.lang.String
				// names of persistent elements
				"attachments":1218831438 // java.util.List<java.io.InputStream>
			},
			// checkpoint byps.gen.js.GenRegistry:138
			// names of inline elements
			{
				"properties":1252554176, // java.util.HashMap<java.lang.String,java.lang.String>
				// names of inline elements
				"dueDate":17, // java.util.Date
				// names of inline elements
				"attachments":1218831438 // java.util.List<java.io.InputStream>
			},
			// inlineInstance
			false
		),
	};
};
task.app.BRegistry_Taskapp.prototype = new byps.BRegistry();
