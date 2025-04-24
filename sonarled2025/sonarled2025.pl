%====================================================================================
% sonarled2025 description   
%====================================================================================
mqttBroker("192.168.1.132", "1883", "sensor/sonar").
dispatch( sonarstart, sonarstart(X) ).
dispatch( sonarstop, sonarstop(X) ).
event( distancestream, distancestream(D) ).
%====================================================================================
context(ctx_sonar, "localhost",  "TCP", "8075").
context(ctx_observers, "192.168.1.132",  "TCP", "8360").
 qactor( sonar_manager, ctx_sonar, "it.unibo.sonar_manager.Sonar_manager").
 static(sonar_manager).
  qactor( sonar_observer, ctx_observers, "it.unibo.sonar_observer.Sonar_observer").
 static(sonar_observer).
