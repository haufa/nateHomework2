// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package Homework2.gRPC_communication

@SerialVersionUID(0L)
final case class isPresentRequest(
    message: _root_.scala.Predef.String = "",
    hour: _root_.scala.Int = 0,
    minute: _root_.scala.Int = 0,
    second: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[isPresentRequest] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = message
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = hour
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      
      {
        val __value = minute
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        }
      };
      
      {
        val __value = second
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = message
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = hour
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      {
        val __v = minute
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = second
        if (__v != 0) {
          _output__.writeInt32(4, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withMessage(__v: _root_.scala.Predef.String): isPresentRequest = copy(message = __v)
    def withHour(__v: _root_.scala.Int): isPresentRequest = copy(hour = __v)
    def withMinute(__v: _root_.scala.Int): isPresentRequest = copy(minute = __v)
    def withSecond(__v: _root_.scala.Int): isPresentRequest = copy(second = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = message
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = hour
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = minute
          if (__t != 0) __t else null
        }
        case 4 => {
          val __t = second
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(message)
        case 2 => _root_.scalapb.descriptors.PInt(hour)
        case 3 => _root_.scalapb.descriptors.PInt(minute)
        case 4 => _root_.scalapb.descriptors.PInt(second)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: Homework2.gRPC_communication.isPresentRequest.type = Homework2.gRPC_communication.isPresentRequest
    // @@protoc_insertion_point(GeneratedMessage[Homework2.isPresentRequest])
}

object isPresentRequest extends scalapb.GeneratedMessageCompanion[Homework2.gRPC_communication.isPresentRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[Homework2.gRPC_communication.isPresentRequest] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): Homework2.gRPC_communication.isPresentRequest = {
    var __message: _root_.scala.Predef.String = ""
    var __hour: _root_.scala.Int = 0
    var __minute: _root_.scala.Int = 0
    var __second: _root_.scala.Int = 0
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __message = _input__.readStringRequireUtf8()
        case 16 =>
          __hour = _input__.readInt32()
        case 24 =>
          __minute = _input__.readInt32()
        case 32 =>
          __second = _input__.readInt32()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    Homework2.gRPC_communication.isPresentRequest(
        message = __message,
        hour = __hour,
        minute = __minute,
        second = __second,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[Homework2.gRPC_communication.isPresentRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      Homework2.gRPC_communication.isPresentRequest(
        message = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        hour = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        minute = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        second = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = GRPCCommunicationProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = GRPCCommunicationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = Homework2.gRPC_communication.isPresentRequest(
    message = "",
    hour = 0,
    minute = 0,
    second = 0
  )
  implicit class isPresentRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, Homework2.gRPC_communication.isPresentRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, Homework2.gRPC_communication.isPresentRequest](_l) {
    def message: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.message)((c_, f_) => c_.copy(message = f_))
    def hour: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.hour)((c_, f_) => c_.copy(hour = f_))
    def minute: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.minute)((c_, f_) => c_.copy(minute = f_))
    def second: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.second)((c_, f_) => c_.copy(second = f_))
  }
  final val MESSAGE_FIELD_NUMBER = 1
  final val HOUR_FIELD_NUMBER = 2
  final val MINUTE_FIELD_NUMBER = 3
  final val SECOND_FIELD_NUMBER = 4
  def of(
    message: _root_.scala.Predef.String,
    hour: _root_.scala.Int,
    minute: _root_.scala.Int,
    second: _root_.scala.Int
  ): _root_.Homework2.gRPC_communication.isPresentRequest = _root_.Homework2.gRPC_communication.isPresentRequest(
    message,
    hour,
    minute,
    second
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[Homework2.isPresentRequest])
}