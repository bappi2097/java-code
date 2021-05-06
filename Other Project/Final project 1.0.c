#include<stdio.h>
#include<string.h>
int Time(){
  time_t currentTime;
  time(&currentTime);
  printf("%s\n",ctime(&currentTime));
}
int book;
struct booking
{
    char r_number[5];
    char name[100];
    char occupation[100];
    char age[5];
    char phone_number[100];
    char stay_day[5];
    char entry_date[12];
    char out_date[12];
}s;
struct service
{
    char billar_id[15],date[15];
    int bill;
}f;
void cheack_out();
main()
{
    system("color 4e");
    system("cls");
        Time();
    printf("\n\n\n\n\t\t=========================================================================\n\n\n\t\t\t\t\tAshiqur Rahman\n\n\n\t\t\t\t\tID:172-35-2112\n\n\n\t\t\t\tHotel Management Software Using C\n\n\n\t\t==========================================================================\n");
    getch();
    login();
}
 /*switc()
{
  int choice;
  printf("\n\n\t\t\t\t\t\tClick Option for Service:");
  scanf("%d",&choice);

  switch(choice)
  {
      case 1:
          login();
          break;
      default :
        printf("\n\n\n\n\t\t\t============================= Wrong Input ============================\n");
        printf("\n\t\t\t\t\t\tPlease Input Correct Key");
        getch();
        switc();
  }
}*/
login(){
       char u_name[20];
       char password[10];
       printf("\t\t\t\t\t=======================================");
       printf("\n\t\t\t\t\t\t  Enter User Name:");
       scanf("%s",&u_name);
       printf("\t\t\t\t\t=======================================");
       printf("\n\t\t\t\t\t\t  Enter Password:");
       scanf("%s",&password);
       if(strcmp(u_name,"rakib")==0)
       {
           if(strcmp(password,"12345")==0)
           {
              printf("\n\t\t\t\t\t\t\tWelcome!\n\t\t\t\t\t   You Have Successfully logged In!!!");
              printf("\n\n\t\t\t\t\t\tClick For Services....");
              getch();
                view_book();

           }
        else
           {
               printf("\n\n\t\t\t\t\tWrong Password!!!");
           }
       }
        else
            {
            printf("\n\n\n\t\t\t\t\t\t   Wrong Username!!!");
            }
}
logo()
{
    printf("\n\t\t================================================================================================\n\n");
    printf("\t\t\t\t\t     $$  $$  $$$$$ $$$$$$ $$$$$$ $$\n");
    printf("\t\t\t\t\t     $$  $$ $$   $$  $$   $$     $$\n");
    printf("\t\t\t\t\t     $$$$$$ $$   $$  $$   $$$$$$ $$\n");
    printf("\t\t\t\t\t     $$  $$ $$   $$  $$   $$     $$\n");
    printf("\t\t\t\t\t     $$  $$  $$$$$   $$   $$$$$$ $$$$$$\n");

    printf("\n\t           $$$     $$$  $$$$$$  $$$     $$ $$$$$$ $$$$$$  $$$$$$ $$$     $$$ $$$$$$ $$$     $$ $$$$$$");
    printf("\n\t           $$ $$ $$ $$  $$  $$  $$ $$   $$ $$  $$ $$      $$     $$ $$ $$ $$ $$     $$ $$   $$   $$");
    printf("\n\t           $$  $$$  $$  $$$$$$  $$  $$  $$ $$$$$$ $$ $$$$ $$$$$$ $$  $$$  $$ $$$$$$ $$  $$  $$   $$");
    printf("\n\t           $$       $$  $$  $$  $$   $$ $$ $$  $$ $$   $$ $$     $$       $$ $$     $$   $$ $$   $$");
    printf("\n\t           $$       $$  $$  $$  $$     $$$ $$  $$ $$$$$$  $$$$$$ $$       $$ $$$$$$ $$     $$$   $$ \n\n");
    printf("\t        ===============================================================================================\n\n");
}
view_book(){
    system("cls");
    Time();
    getch();
    int choose;
    logo();
    printf("\t\t\t\t\t\t1.Room Booking\n\n\t\t\t\t\t\t2.View Room Records\n\n\t\t\t\t\t\t3.Search Customer Detail\n\n\t\t\t\t\t\t4.Check-Out\n\n\t\t\t\t\t\t5.Services\n\n\t\t\t\t\t\t6.Notification");
    printf("\n\n\t\t\t\t\t  \tEnter Your Choice:");
    scanf("%d",&choose);
 switch(choose){
     case 1:r_booking();
     break;
     case 2:view();
     break;
     case 3:search_room_number();
     break;
     case 4:cheack_out();
     break;
     case 5:ser_case();
     break;
     case 6:
        system("cls");
        notify();
        break;
               }
}
struct food_price{
     int rice,polaw,fried_rice,meat,fish_elish,fish_rui;
     int barger,sandwitch,pizza,pestry,sweets,biscutes;
}ss;
ser_case(){
    system("cls" );
    Time();
    getch();
    logo();
int ser_choice;
printf("\n\n\t\t\t\t\t\t 1. Food Price Update\t\t\t\t0.Back\n\n\t\t\t\t\t\t 2. Food Prices\n\n\t\t\t\t\t\t 3.Search Bills\n");
printf("\n\n\t\t\t\t\t\t Enter Your Choice:");
scanf("%d",&ser_choice);                                            //FOOD SERVICE
switch(ser_choice)
{
case 1:food_price_update();
       break;
case 2:food_price_view();
       break;
case 0:view_book();
       break;
case 3:bill_search();
      break;
}
}
    printf("\n\t105\t\tDouble(1B)\t\t%s\t\t\t%s Days\t\t%s\t%s\n",able,day,date,date_out);
    fp=fopen("detail.txt","r");
    strcpy(day,"N/A");
    strcpy(date,"N/A");
    strcpy(date_out,"N/A");
    strcpy(able,"Yes");
    while(fread(&s,sizeof(s),1,fp))
    {
        if(strcmp(s.r_number,"106")==0)
        {
            strcpy(able,"No");

    strcpy(able,"Yes");
    while(fread(&s,sizeof(s),1,fp))
    {
        if(strcmp(s.r_number,"108")==0)
        {
            strcpy(able,"No");
            strcpy(day,s.stay_day);
            strcpy(date,s.entry_date);
            strcpy(date_out,s.out_date);
        }
    }
    fclose(fp);
    printf("\n\t108\t\tDouble(1B)\t\t%s\t\t\t%s Days\t\t%s\t%s\n",able,day,date,date_out);
    fp=fopen("detail.txt","r");
    strcpy(day,"N/A");
    strcpy(date,"N/A");
    strcpy(date_out,"N/A");
    strcpy(able,"Yes");
    while(fread(&s,sizeof(s),1,fp))
    {
        if(strcmp(s.r_number,"109")==0)
        {
            strcpy(able,"No");
            strcpy(day,s.stay_day);
            strcpy(date,s.entry_date);
            strcpy(date_out,s.out_date);
        }
    }
    fclose(fp);
    printf("\n\t109\t\tDouble(1B)\t\t%s\t\t\t%s Days\t\t%s\t%s\n",able,day,date,date_out);
    fp=fopen("detail.txt","r");
    strcpy(day,"N/A");
    strcpy(date,"N/A");
    strcpy(date_out,"N/A");
    strcpy(able,"Yes");
    while(fread(&s,sizeof(s),1,fp))
    {
        if(strcmp(s.r_number,"110")==0)
        {
            strcpy(able,"No");
            strcpy(day,s.stay_day);
            strcpy(date,s.entry_date);
            strcpy(date_out,s.out_date);
        }
    }
    fclose(fp);
    printf("\n\t110\t\tDouble(1B)\t\t%s\t\t\t%s Days\t\t%s\t%s\n",able,day,date,date_out);
    printf("\n\n\t\t\t\t\t\tWhich Room You Want To Book:");
    scanf("%d",&book);
    system("cls" );
    Time();
    getch();
    logo();
 printf("\n\t\t\t\t\t\tFill Up The Form\n\n");
 p
void search_room_number()
{
    system("cls");
   printf("\t\t\t\t\t\tCustomer About Search Option\n\n");
   printf("\t\t\t\t==========================================================");
   FILE *fp;
   fp=fopen("detail.txt","r");
   struct booking s;
   char se_room[20];
   printf("\n\n\t\t\t\t\t\t Enter Room Number:");
   scanf("%s",se_room);
   while(fread(&s,sizeof(s),1,fp))
    {
        if (strcmp(se_room,s.r_number) == 0)
        {
       printf("\n\n\n\tName\tAge\tPhone Number\tOccupation\tStaying Day\tRoom Number\tEntry Date\tExit date\n");
       printf("\t=================================================================================================================");
       printf("\n\t%s\t%s\t%s\t%s\t\t%s\t\t%s\t\t%s\t%s\n",s.name,s.age,s.phone_number,s.occupation,s.stay_day,s.r_number,s.entry_date,s.out_date);
       getch();
       }
   }
fclose(fp);
view_book();
}
void cheack_out()
{
    char se_room[5];
    char se_name[20];
    int i;
    system("cls");
    Time();
    getch();
    FILE *fp;
    struct booking s;
    logo();
    printf("\n\t\t\t\t\t\tEnter Room Number:");
    fflush(stdin);
    scanf("%s",se_room);
    printf("\n\t\t\t\t\t\tEnter Name:");
    fflush(stdin);
    scanf("%s",se_name);
    fp=fopen("detail.txt","r+");
    rewind(fp);
    while(fread(&s,sizeof(s),1,fp))
    {
        if (strcmp(se_room,s.r_number)==0 && strcmp(s.name,se_name)==0)
        {
            fseek(fp,-sizeof(s),SEEK_CUR);
            for(i=0;i<6;i++)
            {
                s.r_number[i]='\0';
            }
            strcpy(s.age,"  ");
            strcpy(s.stay_day,"  ");
            strcpy(s.occupation,"  ");
            strcpy(s.phone_number,"  ");
            strcpy(s.entry_date,"  ");
            strcpy(s.out_date,"  ");
            fwrite(&s,sizeof(s),1,fp);
            fclose(fp);
        }

    else{
            fclose(fp);
        printf("\n\t\t\t\t\t\t Wrong Input");
        getch();
        view_book();}
    }

printf("\n\t\t\t\t\t\t   Room Number %s\n\n\t\t\t\t\t\tSuccessfully Check-out\n\n\t\t\t\t\tNow The Room Is Empty & Ready To Book",se_room);
    fclose(fp);
    getch();
    view_book();
}
void notify()
{
    logo();
    char today_date[12];
    printf("\n\n\n\t\t\t\tEnter Today Date:");
    fflush(stdin);
    scanf("%s",today_date);
    int count=0;
    FILE *fp;
    fp=fopen("detail.txt","r");
    struct booking s;
    while(fread(&s,sizeof(s),1,fp))
    {
        if (strcmp(s.out_date,today_date)==0)
        {
            printf("\n\t\t Room No:%s \tDate:%s\t Last Date Today",s.r_number,s.out_date);
            count++;
        }
    }
    fclose(fp);
    if(count==0)
    {
        printf("\n\t\t\t\tNo Notification For Today");
    }
    getch();
    view_book();

}
