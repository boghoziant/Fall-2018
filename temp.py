import pandas as pd
from pandas import DataFrame
import matplotlib.pyplot as plt
import numpy as np
from numpy.polynomial.polynomial import polyfit



#Linear Regression with Libraries
Stock_Market = pd.read_csv(r'D:\Downloads\insurance.csv')
df = DataFrame(Stock_Market,columns=['X','Y'])

df_no_outliers = df.sort_values(by = "X")[:-2]

plt.scatter(df['X'], df['Y'], color='red')
plt.plot(np.unique(df['X']), np.poly1d(np.polyfit(df['X'], df['Y'], 1))(np.unique(df['X'])))

plt.scatter(df_no_outliers['X'], df_no_outliers['Y'], color='red')
plt.plot(np.unique(df_no_outliers['X']), np.poly1d(np.polyfit(df_no_outliers['X'], df_no_outliers['Y'], 1))(np.unique(df_no_outliers['X'])),color="green")

x = np.arange(0,120,.1)
y = np.array(np.poly1d(np.polyfit(df_no_outliers['X'], df_no_outliers['Y'], 1)))[0] * x + np.array(np.poly1d(np.polyfit(df_no_outliers['X'], df_no_outliers['Y'], 1)))[1]

plt.plot(x,y)
plt.title('X vs Y', fontsize=14)
plt.xlabel('Number of claims', fontsize=14)
plt.ylabel('Total payment of all claims', fontsize=14)
plt.grid(True)

plt.figure(num=None, figsize=(20, 20), dpi=120, facecolor='w', edgecolor='k')

#Polyfit Data
print("Polyfit gives the minimized squared error as")
print(np.poly1d(np.polyfit(df_no_outliers['X'], df_no_outliers['Y'], 1)))

#Gradient Descent
iterations = 1000
cost_limit = .001
result = 0
n = len(df["X"])
theta_zero = 1
theta_one = 1
def cost_zero():
    for i in range(n):
        
        result = (theta_zero + theta_one * np.array(df_no_outliers["X"][i])) - np.array(df_no_outliers["Y"][i])
        return result

def cost_one():
    for i in range(n):
        result = ((theta_zero + theta_one * np.array(df_no_outliers["X"][i])) - np.array(df_no_outliers["Y"][i])) * np.array(df_no_outliers["X"][i])
        return result    

learning_rate = .05

j = 0 
while (j < iterations):
    prev_theta_zero = theta_zero - learning_rate * (1/n) * cost_zero()
    prev_theta_one = theta_one - learning_rate * (1/n) * cost_one()
    theta_zero = prev_theta_zero
    theta_one = prev_theta_one

plt.plot(theta_zero,theta_one)

#Normal Equations
m = len(df["X"])
n = 1
X = np.array(df["X"])
y = np.array(df["Y"])
w = np.linalg.inv((X.T * X)) * X.T * y

