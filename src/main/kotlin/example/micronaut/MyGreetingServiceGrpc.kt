package example.micronaut

import example.micronaut.grpc.GreetingRequest
import example.micronaut.grpc.GreetingResponse
import example.micronaut.grpc.GreetingServiceGrpcKt
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Suppress("unused")
class MyGreetingServiceGrpc(
) : GreetingServiceGrpcKt.GreetingServiceCoroutineImplBase() {
    override suspend fun greet(request: GreetingRequest): GreetingResponse {
        return GreetingResponse.newBuilder().setGreeting("Hello").build()
    }

}